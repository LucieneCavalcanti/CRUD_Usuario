package data;

import java.util.ArrayList;
import model.UsuarioModel;

public interface CRUD {
//métodos abstratos
public boolean incluir(UsuarioModel obj)
throws Exception;
public boolean editar(UsuarioModel obj)
throws Exception;
public boolean excluir(int id)
throws Exception;
public ArrayList<UsuarioModel> pesquisar
(String pesquisa) throws Exception;

}
