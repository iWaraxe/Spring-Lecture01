package com.coherentsolutions.section01;

public class TraditionalDependencyManagement {

    static class SpecificRepository {
        public void performOperation() {
            System.out.println("Performing operation in SpecificRepository");
        }
    }

    static class TraditionalService {
        private SpecificRepository repository = new SpecificRepository();

        public void execute() {
            System.out.println("Executing service operation.");
            repository.performOperation();
        }
    }

    public static void main(String[] args) {
        TraditionalService service = new TraditionalService();
        service.execute();
    }
}
