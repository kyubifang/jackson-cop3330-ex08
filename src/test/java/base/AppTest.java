package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_people_pizzas_slices_and_left() {
        App myApp = new App();
        int people = 8;
        int pizzas = 2;
        int slices = 8;
        int pizzaSlices = pizzas * slices;
        int split = pizzaSlices / people;
        int left = 0;

        String expectedOutput = """
                8 people with 2 pizzas (16 slices)
                Each person gets 2 pieces of pizza.
                There are 0 leftover pieces.""";
        String actualOutput = myApp.generateOutputString(people, pizzas, pizzaSlices, split, left);

        assertEquals(expectedOutput, actualOutput);
    }
}