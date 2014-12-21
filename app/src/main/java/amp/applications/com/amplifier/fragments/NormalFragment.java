package amp.applications.com.amplifier.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import amp.applications.com.amplifier.R;


public class NormalFragment extends ListFragment {
    ListView listView;
    private ArrayList<String> text;
    private ArrayAdapter<String> stringArrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        text = new ArrayList<>();
        text.add("A. INPUTS — входные гнезда для подключения инструментов.");
        text.add("B. BRIGHT — переключатель для дополнительного подъема уровня сигнала в области высоких частот.");
        text.add("C. VOLUME — регулятор громкости усилителя.");
        text.add("D. TREBLE — регулятор уровня высоких частот.");
        text.add("E. MIDDLE — регулятор уровня средних частот.");
        text.add("F. BASS — регулятор уровня низких частот.");
        text.add("Примечание:");
        text.add("• {А и G} — оба входа INPUTS “1” имеют большую чувствительность (+6 дБ) по сравнению с входами INPUTS “2”");
        text.add("• {B и H} — работа режима BRIGHT, осуществляющего подъем высоких частот, более ощутима на низких уровнях громкости.");
        text.add("• {D-F и J-L} –- если эта группа регуляторов тембра одного из каналов повернута до упора против часовой стрелки, то на выходе усилителя данного канала звук будет отсутствовать.");
        text.add("• {M-O} –- эффекты REVERB и VIBRATO работают только для канала VIBRATO.");
        text.add("• {J} –- канал VIBRATO по сравнению с каналом NORMAL имеет значительный подъём частотной характеристики в области высоких частот.");
        listView = (ListView)getActivity().findViewById(android.R.id.list);
        stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, text);
        setListAdapter(stringArrayAdapter);
        View rootView = inflater.inflate(R.layout.fragment_normal, container, false);
        return rootView;
    }
}