    package pe.edu.idat.ec3_torresmateo;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;

    import android.os.Bundle;

    import java.util.ArrayList;
    import java.util.Calendar;

    import pe.edu.idat.ec3_torresmateo.databinding.ActivityMainBinding;

    public class MainActivity extends AppCompatActivity {

        private ActivityMainBinding binding;

        private BusAdapter busAdapter = new BusAdapter();

        Calendar calendar = Calendar.getInstance();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            binding.rvbus.setLayoutManager(
                    new LinearLayoutManager(getApplicationContext())
            );
            binding.rvbus.setAdapter(busAdapter);
            busAdapter.setData(getData());
        }

        private ArrayList<Bus> getData(){
            ArrayList<Bus> list = new ArrayList<>();
            calendar.set(2023, Calendar.NOVEMBER, 23, 10, 15);
            list.add(new Bus(list.size() + 1,
                    R.drawable.image1,
                    "Amauta",
                    calendar.getTime(),
                    15));
            calendar.set(2019, Calendar.MAY, 21, 14, 30);
            list.add(new Bus(list.size() + 1,
                    R.drawable.image1,
                    "Atocongo",
                    calendar.getTime(),
                    30));
            calendar.set(2021, Calendar.SEPTEMBER, 11, 9, 45);
            list.add(new Bus(list.size() + 1,
                    R.drawable.image1,
                    "Alipio",
                    calendar.getTime(),
                    40));

            return list;
        }
    }