# 🚀 Java Streams Practice – Intermediate to Advanced 💡

Welcome to my **Java Streams Mastery Repo**!  
Here, I'm practicing and perfecting my skills with the Java Streams API — from clean transformations to complex grouping, sorting, and filtering.

---

## 📚 Topics Covered

✅ Grouping & Mapping  
✅ Sorting keys and values  
✅ Filtering within groups  
✅ Stream flattening (`flatMap`)  
✅ Working with `Map.Entry`  
✅ Collectors (`groupingBy`, `mapping`, `joining`, `collectingAndThen`)  
✅ Real-world stream challenges  

---

## 💼 Practice Challenges

| #  | Challenge Description                          | Concepts Used                              |
|----|-----------------------------------------------|---------------------------------------------|
| 1  | First Non-Repeating Character                 | `chars()`, `filter`, `Collectors.counting`  |
| 2  | Flatten Words into Characters                 | `flatMap`, `mapToObj`, `split("")`          |
| 3  | Group Words by First Letter                   | `groupingBy`, `charAt(0)`                   |
| 4  | Find 2nd Highest Salary (Employees Grouped)   | `groupingBy`, `sorted`, `skip`, `mapping`   |
| 5  | Sorted Employee Names Grouped by Salary       | `mapping`, `collectingAndThen`, `sorted`    |

> 💡 More challenges added regularly...

---

## 🛠️ Sample Code Snippet

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
