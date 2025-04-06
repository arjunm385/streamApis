package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyntraEmployeeSalaryProblem {
    public static void main(String[] args) {

        Map<String, Integer> employeeSalaries = new HashMap<>();

        employeeSalaries.put("Alice", 50000);
        employeeSalaries.put("Bob", 60000);
        employeeSalaries.put("Charlie", 50000);
        employeeSalaries.put("David", 70000);
        employeeSalaries.put("Eva", 60000);
        employeeSalaries.put("Frank", 75000);
        employeeSalaries.put("Grace", 50000);
        employeeSalaries.put("Hannah", 75000);
        employeeSalaries.put("Ian", 60000);
        employeeSalaries.put("Jane", 80000);

        int n = 3;

        var res = employeeSalaries.entrySet()
                .stream()
                .collect(Collectors.groupingBy
                        (i-> i.getValue(), Collectors.mapping(i-> i.getKey(), Collectors
                                .collectingAndThen(Collectors.toList(),
                                        i->i.stream().sorted()
                                                .toList()))))
                .entrySet().stream()
                .sorted((i1, i2)-> i2.getKey()-i1.getKey())
                        .skip(n).findFirst().orElse(null);

        System.out.println(res);
    }
}