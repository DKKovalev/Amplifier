package amp.applications.com.amplifier.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import amp.applications.com.amplifier.R;


public class TechSpecsFragment extends ListFragment {
    ListView listView;
    private ArrayList<String> text;
    private ArrayAdapter<String> stringArrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        text = new ArrayList<>();


        text.add("Основное: "
                + '\n' + "Название модели: '65 Twin Reverb®, 120V"
                + '\n' + "Номер модели: 0217300000"
                + '\n' + "Серия: Vintage Reissue"
                + '\n' + "Цвет: Черный"
                + '\n' + "Тип усиления: Лампа");

        text.add("Электроника и управление: "
                + '\n' + "Управление: Normal Channel: Bright Switch, Volume, Treble, Middle, Bass. Vibrato Channel: Bright Switch, Volume, Treble, Middle, Bass, Reverb. Vibrato: Speed, Intensity"
                + '\n' + "Напряжение: 120V"
                + '\n' + "Нагрузка: 4Ом на оба динамика"
                + '\n' + "Выходы: Четыре - (1/4\", Два Normal и Два Vibrato)"
                + '\n' + "Дополнительный вход: Отсутствует"
                + '\n' + "Разъем для динамика: Два 1/4' Параллельных (Внутренние и Внешние)"
                + '\n' + "Каналы: Два (Normal, Vibrato)"
                + '\n' + "Ректификатор: Твердотельный");


        text.add("Характеристики: "
                + '\n' + "Материал корпуса: 7-Ply 5/8' Березовая Фанера;"
                + '\n' + "Ручки: Molded Plastic Strap with Nickel-Plated Caps;"
                + '\n' + "Передняя панель: Blackface™ Style;"
                + '\n' + "Покрытие решетки: Black Textured Vinyl Covering with Silver Grille Cloth;"
                + '\n' + "Ширина: 10.5' (26.7 cм);"
                + '\n' + "Длина: 26.5' (67.31 cм);"
                + '\n' + "Высота: 19.87' (50.46 cм);"
                + '\n' + "Вес: 64 lbs. (29 кг);"
                + '\n' + "Эффекты: Реверберация, вибрато");

        text.add("Динамики: "
                + '\n' + "Динамик: Два - 12' Jensen® C12K с керамическими магнитами"
                + '\n' + "Сопротивление: 4Ом.");

        text.add("Лампы: "
                + '\n' + "Лампы предусиления: Groove Tubes® - (4 x 12AX7), (2 X 12AT7)"
                + '\n' + "Лампы усиления: Groove Tubes® - (4 x 6L6)");


        text.add("Разное: "
                + '\n' + "Особенности: Реверберация, Вибрато, Двухкнопочный Футсвитч, Корпус из Балтийской Березы");

        text.add("Аксессуары: "
                + '\n' + "Футсвитч: Двухкнопочный"
                + '\n' + "Кнопки: Vintage-Style Skirted Black Plastic"
                + '\n' + "Аксессуары: Двухкнопочный Футсвитч для включения/отключения Вибрато."
                + '\n' + "Покрытие: Опционально.");

        View rootView = inflater.inflate(R.layout.fragment_tech_specs, container, false);
        listView = (ListView) getActivity().findViewById(android.R.id.list);
        stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, text);
        setListAdapter(stringArrayAdapter);
        return rootView;
    }
}