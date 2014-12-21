package amp.applications.com.amplifier.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import amp.applications.com.amplifier.R;


public class VibratoFragment extends ListFragment {
    ListView listView;
    private ArrayList<String> text;
    private ArrayAdapter<String> stringArrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        text = new ArrayList<>();
        text.add("G. INPUTS — входные гнезда для подключения инструментов.");
        text.add("H. BRIGHT — переключатель для дополнительного подъема уровня сигнала в области высоких частот.");
        text.add("I. VOLUME — регулятор громкости усилителя.");
        text.add("J. TREBLE — регулятор уровня высоких частот.");
        text.add("K. MIDDLE — регулятор уровня средних частот.");
        text.add("L. BASS — регулятор уровня низких частот.");
        text.add("M. REVERB — регулятор уровня эффекта REVERB. Отключение эффекта REVERB осуществляется поворотом данного регулятора до упора против часовой стрелки. Включение и выключение эффекта REVERB может также осуществляться ножным переключателем.");
        text.add("N. SPEED — регулирует скорость эффекта VIBRATO. Эффект VIBRATO не работает без подключенной ножной педали.");
        text.add("O. INTENSITY — регулирует интенсивность эффекта VIBRATO. Отключение эффекта VIBRATO осуществляется поворотом данного регулятора до упора против часовой стрелки. Включение и выключение эффекта REVERB может также осуществляться ножным переключателем.");
        View rootView = inflater.inflate(R.layout.fragment_vibrato, container, false);
        listView = (ListView)getActivity().findViewById(android.R.id.list);
        stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, text);
        setListAdapter(stringArrayAdapter);
        return rootView;
    }
}