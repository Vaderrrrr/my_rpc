package com.vader.test;

import com.vader.rpc.api.ByeService;

public class ByeServiceImpl implements ByeService {
    @Override
    public String bye(String name) {
        return "Bye "+name;
    }
}
