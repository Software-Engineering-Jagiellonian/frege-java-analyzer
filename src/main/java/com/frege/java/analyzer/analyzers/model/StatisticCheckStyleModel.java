package com.frege.java.analyzer.analyzers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StatisticCheckStyleModel {
    @JsonProperty("checkstyle")
    public CheckstyleModel checkstyle;
}

