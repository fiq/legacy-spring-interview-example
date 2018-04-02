package com.application.controller.rest;

import com.application.model.NumberSequence;
import org.springframework.web.bind.annotation.*;

/**
 * Exposes the fibonacci series
 */
@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    @RequestMapping(value = "/{number}", method = RequestMethod.GET)
    public @ResponseBody
    NumberSequence fibonacci(@PathVariable("number") int number) {
        return new NumberSequence();
    }
}
