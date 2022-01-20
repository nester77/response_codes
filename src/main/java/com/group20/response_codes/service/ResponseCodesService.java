package com.group20.response_codes.service;

import com.group20.response_codes.entity.ResponseCodes;

import java.util.HashSet;
import java.util.List;

public interface ResponseCodesService {

    public HashSet<ResponseCodes> getRandomResponseCodes (String status);
    public List<ResponseCodes> findAll ();
}
