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

public class AccidentPreventionFragment extends ListFragment {
    ListView listView;
    private ArrayList<String> text;
    private ArrayAdapter<String> stringArrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_accident_prevention, container, false);

        text = new ArrayList<String>();
        text.add(" • Во избежание повреждения и возгорания комбо, а также поражения электрическим током, не эксплуатируйте прибор под дождём или в условиях повышенной влажности.");
        text.add(" • Внутри прибора отсутствуют узлы, обслуживаемые пользователем, при неисправностях пользуйтесь услугами только квалифицированного персонала.");
        text.add(" • Используйте кабель питания, предназначенный только для данного комбо.");
        text.add(" • Усилитель должен быть обязательно заземлен.");
        text.add("• Выключите усилитель и отсоедините кабель питания от сетевой розетки перед влажной чисткой внешних частей комбо. Протирайте\n" +
                "комбо только мягкой фланелевой тканью. Дождитесь полного высыхания наружных (и внутренних) поверхностей прежде, чем подключить комбо в сеть питания.\n" +
                "Современная модель ‘65 Twin Reverb имеет высокую надёжность и качество. Многие музыканты со всего мира оценили разносторонние\n" +
                "возможности модели Twin Reverb, которая стала классическим усилителем для гитары, баса, клавишных, вокала, аккордеона\n" +
                "и электроскрипки. Она отличалась наличием двух специальных каналов (REVERB и VIBRATO). Тысячи студийных записей и\n" +
                "бесконечное число сценических концертов были произведены с использованием этой модели, изготовленной в 1954 году. Современный\n" +
                "комбо ‘65 Twin Reverb является точной копией комбо Twin Reverb (модель AB 763) 1965 года. Разработчики фирмы Fender\n" +
                "приложили максимум усилий для создания её точной копии. Для более высокой надёжности и эффективности производства некоторые\n" +
                "электронные части, выполненные из фенола, заменены печатными платами с полным сохранением идентичности их параметров.\n" +
                "Трансформатор мощности и выходной трансформатор изготовлены по оригинальным спецификациям 85-ваттной модели\n" +
                "‘65 Twin Reverb. Некоторые компоненты и детали современного комбо ’65 Twin Reverb могут отличаться по форме и размерам от\n" +
                "оригинала, но полностью идентичны их заданным параметрам. Динамик, используемый в комбо, является точной копией оригинального\n" +
                "12” Jensen, разработанного специально для фирмы Fender и применявшегося в 60-х годах.\n" +
                "Предлагается внимательно изучить данное руководство перед началом эксплуатации комбо с целью лучшего понимания его характеристик.\n" +
                "Это позволит вам приобщиться к богатому музыкальному наследию, созданному при помощи комбо ‘65 Twin Reverb.");


        listView = (ListView)getActivity().findViewById(android.R.id.list);

        stringArrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, text);
        setListAdapter(stringArrayAdapter);
        return rootView;
    }
}
