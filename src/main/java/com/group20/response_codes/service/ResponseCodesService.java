package com.group20.response_codes.service;

import com.group20.response_codes.entity.ResponseCodes;

import java.util.List;

public interface ResponseCodesService {

    List<ResponseCodes> getRandomResponseCodes(String status);

    List<ResponseCodes> findAll();

    ResponseCodes getRandomResponseCode(List<ResponseCodes> responseCodes);

    boolean isAnswerTrue(String answer, String trueAnswer);
}
