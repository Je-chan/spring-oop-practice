package com.spring.oop;

import com.spring.oop.config.Config;
import com.spring.oop.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);
        // 순수 자바에서처럼 new 를 사용할 사용할 필요가 없음
        // Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}
