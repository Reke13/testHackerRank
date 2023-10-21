package com.inditex.zarachallenge.controller.exceptions;

public class BussinesErrorExceptionDTO {
  private String code;
  private String description;

  BussinesErrorExceptionDTO(BussinesErrorCodes bussinesErrorCode) {
    this.code = bussinesErrorCode.getCode();
    this.description = bussinesErrorCode.getDescription();
  }

  public String getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }
}
