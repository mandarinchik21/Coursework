package com.example.coursework2_0.controllers;

import com.example.coursework2_0.dto.ExpenseDto;
import com.example.coursework2_0.dto.IncomeDto;
import com.example.coursework2_0.dto.OperationDto;
import com.example.coursework2_0.model.Expense;
import com.example.coursework2_0.model.Income;
import com.example.coursework2_0.model.Operation;
import com.example.coursework2_0.model.OperationType;
import com.example.coursework2_0.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OperationController {
    private OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping("/operations")
    public String operations(Model model) {
        List<OperationDto> operationList = operationService.getAllOperations();
        model.addAttribute("operations", operationList);
        System.out.println("Getting operations");
        System.out.println(operationList);
        return "operations";
    }

    public String operationTypeSpecificInfo(OperationDto operation) {
        if (operation.getOperationType() == OperationType.EXPENSE) {
            // Display expense-specific details
            return "Expense Type: " + ((ExpenseDto) operation).getExpenseType(); // Assuming ExpenseDto has getExpenseType() method
        } else if (operation.getOperationType() == OperationType.INCOME) {
            // Display income-specific details
            return "Income Type: " + ((IncomeDto) operation).getIncomeType(); // Assuming IncomeDto has getIncomeType() method
        } else {
            return ""; // Default or error message
        }
    }
}
