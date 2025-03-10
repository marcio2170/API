package med.voll.api.controller;

import lombok.Getter;

@Getter
public class TestLombok {

    private Long id;

    public static void main(String[] args) {
        TestLombok test = new TestLombok();
        System.out.println(test.getId()); // Deve compilar sem erros
    }

}
