package javarunner.core.javaeight.conceptoftheday.splitIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

/*
SplitIterator As the name itself suggests, it can be used for both, partitioning as well as iterating.
The source to Spliterator can be an array or a collection or a stream or an I/O channel.
 */
public class TestSplitIterator {

    public static void main(String[] args) {
        //tryAdvance() performs given action on next element,it is used to traverse the elements one by one
       List<String> languageList = Arrays.asList("Java","C","C++","Python","Scala","Kotlin");
       Spliterator<String> languageSplitIterator =languageList.spliterator();
       //languageSplitIterator.tryAdvance(s -> System.out.println(s));
       //languageSplitIterator.tryAdvance(s -> System.out.println(s));
       //forEachRemaining() Performs the given action on each of the remaining elements. It is used to traverse the elements in bulk.
       //languageSplitIterator.forEachRemaining(s -> System.out.println(s));

       //trySplit() ,this method splits current SplitIterator into SplitIterator,it is helpful in parallel programming
        List<String> languageList1 = Arrays.asList("Java8","C","C++","Python","Scala","Kotlin");
        Spliterator<String> languageSplitIterator1 =languageList1.spliterator();
        Spliterator<String> anotherLanguageSplitIterator1 =languageSplitIterator1.trySplit();
        System.out.println("From 1'st SplitIterator");
        System.out.println("-----------------------");
        languageSplitIterator1.tryAdvance(s -> System.out.println("xxx "+s));
        languageSplitIterator1.forEachRemaining(s -> System.out.println(s));
        System.out.println("-----------------------");
        System.out.println("From 2'nd SplitIterator");
        anotherLanguageSplitIterator1.forEachRemaining(s -> System.out.println(s));

      //estimateSize():It returns the estimate of number of elements yet to be traversed by the Spliterator.
        List<String> languageList2 = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
        Spliterator<String> languageSpliterator2 = languageList2.spliterator();
        System.out.println(languageSpliterator2.estimateSize());       //Output : 6
        languageSpliterator2.tryAdvance(System.out::println);
        System.out.println(languageSpliterator2.estimateSize());

        //getExactSizeIfKnown() : It returns exact size if known, otherwise returns -1.
        List<String> languageList3 = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
        Spliterator<String> languageSpliterator3 = languageList3.spliterator();
        System.out.println(languageSpliterator3.getExactSizeIfKnown());       //Output : 6
        languageSpliterator3.tryAdvance(System.out::println);
        System.out.println(languageSpliterator3.getExactSizeIfKnown());

       //characteristics() : Returns set of characteristics of elements in an integer form.
        List<String> languageList4 = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
        Spliterator<String> languageSpliterator4 = languageList4.spliterator();
        System.out.println(languageSpliterator4.characteristics());
        //hasCharacteristics() : Checks whether this Spliterator has specified characteristics or not.
        List<String> languageList5 = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
        Spliterator<String> languageSpliterator5 = languageList5.spliterator();
        System.out.println(languageSpliterator5.hasCharacteristics(16464));
        /*
         *   getComparator() : It returns Comparator of the source if it is sorted, otherwise throws IllegalStateException. If the source is sorted in natural order, it returns null.
         */
        List<String> languageList6 = Arrays.asList("Ajay", "Dhawal", "Nachiket");
        Spliterator<String> languageSpliterator6 = languageList6.spliterator();
        System.out.println(languageSpliterator6.getComparator());

    }
}
