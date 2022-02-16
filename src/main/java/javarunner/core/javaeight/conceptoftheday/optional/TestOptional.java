package javarunner.core.javaeight.conceptoftheday.optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        Person person = new Person();

        //It creates an empty optional object
        Optional<House> house = Optional.empty();

        //creates an optional object with specified non-null value,throws NPE if null value passed
        Optional<House> house1 = Optional.of(new House());
        //This method returns the value present in the Optional object. If the value is absent, throws NoSuchElementException.
            house1.get();

        //creates an Optional object with specified value if the value in non-null,
        //if the value is null returns an empty Optional.
        Optional<House> house2 = Optional.ofNullable(new House());
        HouseLoanProperty houseLoanProperty = new HouseLoanProperty();
        houseLoanProperty.setHouseLoanDetails("Loan property");
        Optional<HouseLoanProperty> optionalHouseLoanProperty = Optional.of(houseLoanProperty);
        System.out.println(optionalHouseLoanProperty.map(houseLoanProperty1 -> houseLoanProperty1.getHouseLoanDetails()).get());

    }


}
