package me.mano.SpringBootLearning.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponse {
  
  private LocalDateTime timeStamp;
  private String errorMessage;
  private String errorDetails;
  private String errorCode;


  public ErrorResponse(String errorMessage, String errorDetails, String errorCode) {
    this.timeStamp = LocalDateTime.now();
    this.errorMessage = errorMessage;
    this.errorDetails = errorDetails;
    this.errorCode = errorCode;
  }

  
}
