package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Noticia extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia);

        TextView titulo = findViewById(R.id.titulo),
                subtitulo = findViewById(R.id.subtitulo),
                autor = findViewById(R.id.autor),
                noticia = findViewById(R.id.noticia),
                dadosautor = findViewById(R.id.autor_data);

        titulo.setText("Estratégias em um Novo Paradigma Globalizado");
        subtitulo.setText("Como um mundo globalizado exige estratégias para um bom entendimento deste.");
        autor.setText("Dener V. Ribeiro");
        noticia.setText(" É importante questionar o quanto a execução dos pontos do programa faz parte de um processo de gerenciamento do orçamento setorial. O empenho em analisar a consulta aos diversos militantes acarreta um processo de reformulação e modernização das diretrizes de desenvolvimento para o futuro. Por outro lado, a contínua expansão de nossa atividade aponta para a melhoria do sistema de participação geral. \n" +
                        "\n" +
                        "          É claro que a expansão dos mercados mundiais auxilia a preparação e a composição de todos os recursos funcionais envolvidos. Do mesmo modo, o novo modelo estrutural aqui preconizado garante a contribuição de um grupo importante na determinação do retorno esperado a longo prazo. Gostaria de enfatizar que o desafiador cenário globalizado assume importantes posições no estabelecimento das posturas dos órgãos dirigentes com relação às suas atribuições. \n" +
                        "\n" +
                        "          Nunca é demais lembrar o peso e o significado destes problemas, uma vez que o fenômeno da Internet facilita a criação do sistema de formação de quadros que corresponde às necessidades. As experiências acumuladas demonstram que a consolidação das estruturas pode nos levar a considerar a reestruturação do remanejamento dos quadros funcionais. Neste sentido, o início da atividade geral de formação de atitudes talvez venha a ressaltar a relatividade dos índices pretendidos. ");
        dadosautor.setText("Dener Vieira Ribeiro, estudante de informática no COLTEC-UFMG.\nPara mais informações, acesse www.deneribeiro.com.br");

    }

    private void newPost(String title, String subtitle, String writer, String news, String data) {




    }

}
