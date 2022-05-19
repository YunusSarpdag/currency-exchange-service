package com.yunus.microservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    CurrencyRepository currencyRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from , @PathVariable String to){
        //CurrencyExchange currencyExchange= new CurrencyExchange(10001L,from,to , BigDecimal.valueOf(15));
        CurrencyExchange currencyExchange = currencyRepository.findByFromAndTo(from,to);
        if(currencyExchange == null){
            throw new RuntimeException("data not found");
        }
        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        return currencyExchange;
    }
}
