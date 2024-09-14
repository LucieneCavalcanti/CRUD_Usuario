package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.UsuarioModel;

public class UsuarioData
extends Conexao implements CRUD {

    @Override
    public boolean incluir(UsuarioModel obj) throws Exception {
        String sql = "insert into tbusuarios
         (nome,email,tipo)
         values (?,?,?)";
       PreparedStatement ps = getConexao().
            prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setInt(3, obj.getTipo());
        if(ps.executeUpdate()>0)
            return true;
        else return false;
    }
    @Override
    public boolean editar(UsuarioModel obj) throws Exception {
        String sql = "update tbusuarios
         set nome=?,email=?,tipo=?
         where id=?";
       PreparedStatement ps = getConexao().
            prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getEmail());
        ps.setInt(3, obj.getTipo());
        ps.setInt(4, obj.getId());
        if(ps.executeUpdate()>0)
            return true;
        else return false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        String sql = "delete from tbusuarios where id=?";
        PreparedStatement ps = getConexao().
           prepareStatement(sql);
       ps.setInt(1, id);
       if(ps.executeUpdate()>0)
           return true;
       else return false;    
    }

    @Override
    public ArrayList<UsuarioModel> pesquisar(String pesquisa) throws Exception {
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String sql = "select * from tbusuarios where 
        nome like ?";
        PreparedStatement ps = getConexao().
        prepareStatement(sql);
        ps.setString(1, pesquisa+"%");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            UsuarioModel obj = new UsuarioModel(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getInt("tipo"));
                dados.add(obj);
        }
        return dados;
    }

}
