<h4><b>Nome:</b> Yasmin Aparecida Vieira<br>
<b>RA:</b> 1460482121014</h4>

<h2>Ciclo de Vida do Desenvolvimento de Software :seedling:
(Plataforma de Ensino)</h2>

<h3>Atividade de Requisitos :construction_worker_woman:</h2>

<h4> - Coletar os requisitos funcionais e não-funcionais do sistema</h4>

<h4><p>:pushpin: Requisitos funcionais: são tarefas ou ações do sistema.</p>
<p>:pushpin: Requisitos não-funcionais: são qualidades do sistema.</h4>

• Os requisitos funcionais são de extrema importância no desenvolvimento de software, pois sem eles não há funcionalidades nos sistemas. Seus modelos devem ser construídos em um nível de entendimento claro e objetivo, além de um código fonte totalmente aplicável.<br>
Como um requisito funcional específico, foi desenvolvido um Diagrama de Casos de Uso:

![](https://github.com/YasminVieira/Bertoti/blob/main/Engenharia%20de%20Software%20I/requisitosFuncionais.jpg)
  
• Uma vez que os requisitos funcionais definem o que o sistema fará, a Engenharia de Software afirma que os requisitos não-funcionais definem <i><b>como</i></b> o sistema fará, embora não seja tão claro assim essa definição. Os requisitos não-funcionais não estão relacionados diretamente às funcionalidades de um sistema.
Dentro dos requisitos não-funcionais, foi desenvolvido uma interface de simples acesso e uso às funções do sistema (Usabilidade):

![](https://github.com/YasminVieira/Bertoti/blob/main/Engenharia%20de%20Software%20I/requisitosNaoFuncionais.jpg)



<h3>Atividade de Projeto :construction_worker_woman:</h3>

<h4>- Transformar os requisitos (tanto funcionais quanto não-funcionais) em algo que possa ser implementado</h4>

<h4><p>:pushpin: Diagrama de Classes:</h4><p>
  
![](https://github.com/YasminVieira/Bertoti/blob/main/Engenharia%20de%20Software%20I/diagramaDeClasse.png)
  

<h3>Atividade de Desenvolvimento :construction_worker_woman:</h3>

<h4><p>- Foi desenvolvido (implementado) um software a partir da sua arquitetura do sistema (“Atividade de Projeto”: Diagrama de Classes), usando a linguagem Java para codificar cada uma das classes criadas</h4>

</div>

<div align="center">
  
  <img src="diagramaDeClassePes.png" alt="diagrama da classe Pessoa">
</div>
<br>

    public class Pessoa {

    private String nome;
    private String matricula;
    private String tipo;

    public Pessoa(String nome, String matricula, String tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  }


<br>
<div align="center">
  
  <img src="diagramaDeClasseTur.png" alt="diagrama da classe Disciplina">
</div>
<br>

     public class Disciplina {

    private String nome;
    private String docente;

    public Disciplina(String nome, String docente) {
        this.nome = nome;
        this.docente = docente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
}




<br>
<div align="center">
  
  <img src="diagramaDeClassePlat.png" alt="diagrama da classe Plataforma de Ensino">
</div>
<br>


    import java.util.LinkedList;
import java.util.List;

public class Plataforma {

    private List<Pessoa> pessoas = new LinkedList<Pessoa>();
    private List<Disciplina> disciplinas = new LinkedList<Disciplina>();

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public Pessoa buscarPessoaNome(String nome){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getNome().equals(nome)){
                return pessoa;
            }
        }
        return null;
    }

    public Pessoa buscarPessoaMatricula(String matricula){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getMatricula().equals(matricula)){
                return pessoa;
            }
        }
        return null;
    }

    public Pessoa buscarPessoaTipo(String tipo){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getTipo().equals(tipo)){
                return pessoa;
            }
        }
        return null;
    }

    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public Disciplina buscarDisciplinaNome(String nome){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getNome().equals(nome)){
                return disciplina;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplinaDocente(String docente){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getDocente().equals(docente)){
                return disciplina;
            }
        }
        return null;
    }

}

<br>

<div id="#dev">
