package com.spring.oop.service;

import com.spring.oop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test() {
        // Given

        // When
        List<String> actual = sut.doSort(List.of("3", "5","2", "4", "1"));

        // Then
        assertEquals(List.of("1", "2", "3", "4","5"), actual);
    }
}