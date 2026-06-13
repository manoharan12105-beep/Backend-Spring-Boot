package me.mano.SpringBootLearning.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import me.mano.SpringBootLearning.entity.ErrorResponse;

@RestControllerAdvice
public class GlobalException {

  @ExceptionHandler(DuplicateProductException.class)
  public ResponseEntity<ErrorResponse> DuplicateProductExceptionHandler(DuplicateProductException dpex, WebRequest request) {
    ErrorResponse error = new ErrorResponse(dpex.getMessage(), request.getDescription(false), "You Stupid, you can't use same name for both Products");

    return new ResponseEntity<>(error, HttpStatus.CONFLICT);
  }

  @ExceptionHandler(ProductNotFoundException.class)
  public ResponseEntity<ErrorResponse> ProductNotFoundExceptionHandler(ProductNotFoundException pnf, WebRequest request) {
    ErrorResponse error = new ErrorResponse(pnf.getMessage(), request.getDescription(false), "Product Not Found");

    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(CategoryNotFoundException.class)
  public ResponseEntity<ErrorResponse> CategoryNotFoundExceptionHandler(CategoryNotFoundException cnf, WebRequest request) {
    ErrorResponse error = new ErrorResponse(cnf.getMessage(), request.getDescription(false), "Category Not Found");
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
  }
}
