package com.detector.pnutour.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    MEMBER_DUPLICATED(HttpStatus.CONFLICT,""), //409
    NOT_SUPPORTED_SOCIAL_PLATFORM(HttpStatus.CONFLICT,""),
    NOT_A_MEMBER(HttpStatus.NOT_FOUND,""), //404 ,일단 404로 처리했긴한데.. 흠
    SOCIAL_LOGIN_FAIL(HttpStatus.CONFLICT,""),
    TOKEN_INVALIDATION(HttpStatus.CONFLICT,""),
    UNKNOWN_SERVER_ERROR(HttpStatus.CONFLICT,""),
    NOT_FOUND_USERTAG(HttpStatus.NOT_FOUND,""),
    LOGIN_FAIL(HttpStatus.PROXY_AUTHENTICATION_REQUIRED,""),
    NOT_FOUND_FOLLOW_RELATION(HttpStatus.NOT_FOUND,"");

    private HttpStatus httpStatus;
    private String message;
}
