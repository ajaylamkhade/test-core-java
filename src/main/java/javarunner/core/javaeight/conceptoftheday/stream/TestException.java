package javarunner.core.javaeight.conceptoftheday.stream;

import javarunner.core.practicecoding.quiz.quiz1.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestException {

    public static void main(String[] args) {

      List<City> cities =  Arrays.asList( new City("Mumbai","west"),new City("Pune","south"), new City("Thane","west"),new City("Nasik","north"));

      cities.stream().map(s -> {
          try {
              return s.getName();
          } catch (Exception e) {
              e.printStackTrace();
          } return null;
      }).collect(Collectors.toList());

    }


    static class City{
        String name;
        String suburb;

        public City(String name, String suburb) {
            this.name = name;
            this.suburb = suburb;
        }

        public String getName() throws Exception
         {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSuburb() {
            return suburb;
        }

        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }
    }

}

