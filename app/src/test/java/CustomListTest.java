import static org.junit.jupiter.api.Assertions.assertEquals;

import android.widget.ArrayAdapter;

import androidx.core.widget.TextViewCompat;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void testAdd() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testDelete() {
        int listSize = list.getCount();
        City halifax = new City("Halifax", "NS");
        list.addCity(halifax);
        assertEquals(list.getCount(), listSize + 1);
        list.deleteCity(halifax);

        assertEquals(listSize, list.getCount());
    }

    @Test
    public void testCountCities() {
        assertEquals(list.getCount(), list.countCities());
        City halifax = new City("Halifax", "NS");
        list.addCity(halifax);
        assertEquals(list.getCount(), list.countCities());
    }
}
