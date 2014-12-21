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


public class LampReplacementFragment extends ListFragment {
    ListView listView;
    private ArrayList<String> text;
    private ArrayAdapter<String> stringArrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        text = new ArrayList<>();
        text.add("По истечении нескольких лет происходит “старение” ламп, и заданные заводские настройки по подбору парных характеристик ламп и параметров сеточных напряжений, подаваемых на них, перестают соответствовать параметрам, рассчитанным на новые лампы. При этом происходит изменение качества звучания комбо, что ощущается на слух. Обычно это касается ламп усилителя мощности, так как лампы предусилителя служат гораздо дольше. При возникновении такой проблемы, для замены ламп обращайтесь в сервисный центр, указанный в гарантийных обязательствах. Замену ламп осуществляйте только на соответствующие типы ламп, указанных в спецификации, расположенной внутри корпуса комбо.");
        text.add("A. Подбор парных характеристик ламп — данная операция позволяет снизить до минимума шум, слышимый в динамиках, из-за некоторых различий значений напряжений, подаваемых на нить накала лампы. Эта процедура обычно нужна при замене ламп. Инструкция по регулировке: включите усилитель на 2 минуты, не подключая никаких инструментов ко входу. Поверните регуляторы VOLUME, MIDDLE, и BASS канала VIBRATO до упора по часовой стрелке, а регулятор TREBLE до упора против часовой стрелки. Поверните ВСЕ регуляторы канала NORMAL до упора против часовой стрелки. Отключите эффекты REVERB и VIBRATO. Затем вставьте отвертку в паз регулятора BALANCE ADJUSTMENT (см. рис.) и вращайте назад и вперёд для определения позиции минимальных шумов.");
        text.add("B. Регулировка сеточного напряжения — эта регулировка необходима при условии, что для замены используются не идентичные оригинальным фабричным лампы. Кроме того, такая регулировка должна выполняться квалифицированным персоналом сервисного центра.");
        View rootView = inflater.inflate(R.layout.fragment_lamp_replacement, container, false);
        listView = (ListView) getActivity().findViewById(android.R.id.list);
        stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, text);
        setListAdapter(stringArrayAdapter);
        return rootView;
    }
}
