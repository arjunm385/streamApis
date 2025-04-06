# 🚀 Java Streams Practice – Intermediate to Advanced 💡

Welcome to my **Java Streams Mastery Repo**!  
This repository contains hands-on practice programs using the Java Streams API to solve real-world style problems efficiently and elegantly.

---

## 📚 Topics Covered

✅ Grouping & Mapping  
✅ Flattening Nested Structures (`flatMap`)  
✅ Sorting keys and values  
✅ Filtering within groups  
✅ `Map.Entry` transformations  
✅ Collectors (`groupingBy`, `mapping`, `joining`, `collectingAndThen`)  
✅ Character-level stream processing  

---

## 💼 Practice Challenges

| #  | File                                 | Description                                      | Concepts Used                                   |
|----|--------------------------------------|--------------------------------------------------|-------------------------------------------------|
| 1  | `FirstNonRepeatingCharacter.java`    | Finds the first non-repeating character in a string | `chars()`, `groupingBy`, `filter`, `counting()` |
| 2  | `FlattenWordsToCharacters.java`      | Converts a list of words into a list of characters | `flatMap`, `split("")`, `mapToObj()`            |
| 3  | `GroupWordsByFirstLetter.java`       | Groups words based on their starting letter        | `groupingBy`, `charAt(0)`                        |
| 4  | `SecondHighestSalary.java`           | Finds second-highest salary and corresponding employees | `groupingBy`, `mapping`, `sorted`, `skip`    |
| 5  | `SortedNamesBySalary.java`           | Groups employees by salary with sorted names       | `mapping`, `collectingAndThen`, `sorted()`      |
| 6  | `AsciiConversionAndFiltering.java`   | Handles ASCII conversion with stream ops           | `IntStream`, `mapToObj`, `chars()`              |

---

## 🧠 Sample Code Snippet

```java
Map<Integer, List<String>> salaryToSortedNames = employeeSalaries.entrySet()
    .stream()
    .collect(Collectors.groupingBy(
        Map.Entry::getValue,
        Collectors.mapping(
            Map.Entry::getKey,
            Collectors.collectingAndThen(
                Collectors.toList(),
                list -> list.stream().sorted().toList()
            )
        )
    ));
