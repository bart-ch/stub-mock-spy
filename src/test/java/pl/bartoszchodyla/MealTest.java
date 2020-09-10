package pl.bartoszchodyla;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.spy;

/**
 * Created by "Bartosz Chodyla" on 2020-09-10.
 */
class MealTest {

    @Test
    void testTotalMealPrice() {

        //given
        Meal meal = spy(Meal.class);
        given(meal.getPrice()).willReturn(15);
        given(meal.getQuantity()).willReturn(3);

        //when
        int result = meal.sumPrice();

        //then
        then(meal).should().getPrice();
        then(meal).should().getQuantity();
        assertThat(result, equalTo(45));
    }

}