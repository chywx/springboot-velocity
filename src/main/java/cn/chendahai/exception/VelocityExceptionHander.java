package cn.chendahai.exception;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 功能描述
 *
 * @author chy
 * @date 2020/3/19 0019
 */
@ControllerAdvice
public class VelocityExceptionHander {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String exceptionHandler(Exception e) {
        System.out.println("未知异常！原因是:" + e);
//        e.printStackTrace();
        return "500";
    }

}
