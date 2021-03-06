package com.starwars.startWarsProject.controller;

import com.starwars.startWarsProject.dto.RequestTradeInfo;
import com.starwars.startWarsProject.service.TradeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade")
public class TradeController {

    TradeService tradeService = new TradeService();

    @PostMapping
    public ResponseEntity<String> tradeItems(@RequestBody RequestTradeInfo requestTradeInfo) throws IllegalAccessException {
        tradeService.tradeItem(requestTradeInfo);
        return ResponseEntity.ok("Troca feita");
    };
}
