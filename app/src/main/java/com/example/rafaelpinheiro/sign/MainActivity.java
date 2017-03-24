package com.example.rafaelpinheiro.sign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private ListView listViewSignos;
    private String listaSignos[] = {"Aries", "Touro", "Gemeos", "Cancer", "Leao", "Virgem", "Libra", "Escorpiao", "Sagitario", "Capricornio", "Aquario", "Peixes"};

    private String listaCaracteristicasSignos[] = {"Pelo lado positivo, os arianos são aventureiros, enérgicos, pioneiros e valentes. Pelo lado negativo, eles podem ser egoístas e ter mal gênio. Os arianos são impulsivos e às vezes têm pouca paciência.",
                                                   "Paciente, persistente, decidido e fiável. Zeloso e possessivo, um cauro pode tender a ser inflexível e ressentido.",
                                                   "Pelo lado positivo, os geminianos são adaptáveis e versáteis. São intelectuais, eloquentes, carinhosos, comunicativos e inteligentes. Pelo lado negativo, os geminianos são superficiais e insconstantes.",
                                                   "Pelo lado positivo, os cancerianos são emotivos, carinhosos, protetores e simpáticos. Pelo lado negativo, os cancerianos têm uma tendência ao mau humor.",
                                                   "Pelo lado positivo, o leonino é generoso, bondoso, fiel e carinhoso. Pelo lado negativo, o leonino é prepotente e mandão.",
                                                   "Seu lado positivo: Modéstia, inteligência e timidez. Seu lado negativo: Conservador e perfeccionista, um virgem tende a preocupar-se demasiado e seu lado duro pode levar-lhe a ser excessivamente crítico e duro com os demais.",
                                                   "Diplomáticos, encantadores e sociáveis. Os librianos são idealistas, pacíficos, otimistas e românticos. Têm um caráter afável e equilibrado. São indecisos e facilmente influenciados por terceiros. Podem mudar de opinião facilmente e ser muito condescendentes.",
                                                   "Pelo lado positivo, é emotivo, decidido, poderoso e apaixonado. Pelo lado negativo, é ciumento, compulsivo e obsessivo.",
                                                   "Pelo lado positivo, são intelectuais, honestos, sinceros e simpáticos. Pelo lado negativo, são tão otimistas que às vezes chegam a ser irresponsáveis.",
                                                   "Pelo lado positivo, o capricorniano é ambicioso e disciplinado. É prático, prudente, tem paciência e é até cauteloso quando preciso. Pelo lado negativo, o capricorniano tende a ser pessimista e, ante a situações difíceis, é um pouco fatalista. ",
                                                   "Pelo lado positivo, o aquariano é simpático e humanitário. É honesto e totalmente leal; é original e brilhante; é independente e intelectual. Pelo lado negativo, o aquariano é imprevisível e tende a contrariar. É pouco emocional e não compreende a complexidade emocional de algumas pessoas e a traição entre amigos.",
                                                   "Pelo lado positivo, é imaginativo e sensível. É amável e tem compaixão. É intuitivo e pensa nos demais. Pelo lado negativo, não assume a realidade. É idealista, mantém segredos e tem uma vontade algo débil. Deixa-se levar pelos demais.."
                                                  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewSignos = (ListView) findViewById(R.id.lisViewSignosId);


        ArrayAdapter<String> arrayAdapterListViewSignos = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, listaSignos);

        listViewSignos.setAdapter(arrayAdapterListViewSignos);

        listViewSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int clickedPosition = position;

                for(int i=1; i<=8;i++) {
                    Toast.makeText(MainActivity.this, listaCaracteristicasSignos[clickedPosition], Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
