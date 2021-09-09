package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Country {

    public enum Continent {ASIA, EUROPE}

    String name;

    Continent region;

    public Country(String na, Continent reg) {
        name = na;
        region = reg;
    }

    public String getName() {
        return name;
    }

    public Continent getRegion() {
        return region;
    }

    public static void main(String[] args) {
        List<Country> couList = Arrays.asList(new Country("Japan", Continent.ASIA), new Country("Italy", Continent.EUROPE), new Country("Germany", Continent.EUROPE));
        Map<Country.Continent, List<String>> regionNames = couList.stream().collect(Collectors.groupingBy(Country::getRegion, Collectors.mapping(Country::getName, Collectors.toList())));
        System.out.println(regionNames);
        System.out.println("----------");
        System.out.println(regionNames.getClass());
        System.out.println("----------");
        for (Map.Entry<Continent, List<String>> continentListEntry : regionNames.entrySet()) {
            System.out.println(continentListEntry);
            System.out.println(continentListEntry.getValue().getClass());
        }
    }

}
