package org.finance.planner.controller;

import org.finance.planner.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinanceController {

    final JwtUtil jwtUtil;

    public FinanceController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping
    public String home(){
        return "hello JWT";
    }
}
