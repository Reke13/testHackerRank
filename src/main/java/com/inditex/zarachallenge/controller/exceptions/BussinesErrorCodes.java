package com.inditex.zarachallenge.controller.exceptions;

public enum BussinesErrorCodes {
  SIMILAR_PRODUCT_NOT_FOUND_EXCEPTION("ERR00001", "This product does not contain similar products.");

  private String code;
  private String description;

  BussinesErrorCodes(String code, String description) {
    this.code = code;
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }
}
