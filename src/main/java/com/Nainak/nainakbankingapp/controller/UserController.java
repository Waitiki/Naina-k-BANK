package com.Nainak.nainakbankingapp.controller;

import com.Nainak.nainakbankingapp.DTO.*;
import com.Nainak.nainakbankingapp.entity.User;
import com.Nainak.nainakbankingapp.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;
    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )

    @ApiResponse(
            responseCode = "201",
            description = "Http status 201 CREATED"
    )
    @PostMapping("/createAccount")
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }

    @GetMapping("/totalBalance")
    public BigDecimal totalBalance(){
        return userService.getTotalAmount();
    }

    @GetMapping("/totalUsers")
    public Long getNumberOfUsers(){
        return userService.userCount();
    }

    @GetMapping("/listOfUsers")
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }
    @PostMapping("/deleteAccount{userId}")
    public BankResponse deleteAccount(@PathVariable Long userId){
        return userService.deleteUser(userId);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, check how much the user has"
    )

    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 CREATED"
    )
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }
    @PostMapping("/credit")
    public  BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userService.transfer(request);
    }
}
