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


public class BackPanelFragment extends ListFragment {
    ListView listView;
    private ArrayList<String> text;
    private ArrayAdapter<String> stringArrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        text = new ArrayList<>();
        text.add("A. POWER RATING — для подключения комбо используйте сетевой кабель с заземлением, рассчитанный только на частоту и напряжение сети, указанные на тыльной панели усилителя.");
        text.add("B. FUSE — электрический предохранитель. В случае его перегорания, заменяется предохранителем ТОЛЬКО такого же типа и номинала, что указан на патроне-держателе. Если предохранитель перегорает повторно, обратитесь к квалифицированному специалисту. Ни при каких обстоятельствах не используйте предохранители другого типа и с большим значением тока, а также не применяйте прямого включения, минуя предохранитель");
        text.add("C. POWER — переключатель режима работы усилителя ON (включённое состояние усилителя - положение переключателя вверх) и OFF (выключенное – положение переключателя вниз).");
        text.add("D. STANDBY — установка переключателя STANDBY в положение ON (тумблер вниз) позволяет избежать пиковых нагрузок при включении усилителя, что увеличивает срок работы ламп и уменьшает время их прогрева до момента установки их нормального рабочего состояния. Положение переключателя OFF (тумблер вверх) отключает режим STANDBY. Сетевой включатель POWER {C} должен быть включён (состояние ON) для нормального функционирования режима STANDBY.");
        text.add("E. MAIN SPEAKER — джековое гнездо, предназначенное для подключения внутреннего динамика. При включенном усилителе динамик должен быть подключен обязательно.");
        text.add("F. EXTERNAL SPEAKER — джековое гнездо, предназначенное для подключения внешней акустической системы. Контакты этогогнезда соединены параллельно с соответствующими контактами гнезда MAIN SPEAKER JACK {E}. Общее сопротивление нагрузки усилителя должно составлять 4 Ом, чтобы избежать повреждения усилителя.");
        text.add("G. FOOTSWITCH — джековое гнездо для подключения напольного переключателя эффектов VIBRATO и REVERB. Эффект VIBRATO не работает при отсутствии подключённого напольного переключателя.");
        View rootView = inflater.inflate(R.layout.fragment_back_panel, container, false);
        listView = (ListView)getActivity().findViewById(android.R.id.list);
        stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, text);
        setListAdapter(stringArrayAdapter);
        return rootView;
    }
}