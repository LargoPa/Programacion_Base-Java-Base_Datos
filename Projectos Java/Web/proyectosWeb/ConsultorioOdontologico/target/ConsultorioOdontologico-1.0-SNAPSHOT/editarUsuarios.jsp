

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/iniciohtml.jsp" %>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

    <h1>Edición de Usuarios</h1>
    <p>Apartado para la edición de usuarios.</p>

    <% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar"); %>
    
    <form class="user" action="SvEditUsuarios" method="post">
        <div class="form-group row">
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                    placeholder="Nombre Usuario" value="<%= usu.getNombreUsuario() %>">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                    placeholder="Contraseña" value="<%= usu.getContrasenia() %>">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="rol" name="rol" 
                    placeholder="Rol" value="<%= usu.getRol() %>">
            </div>

        </div>

        <button class="btn btn-primary btn-user btn-block" type="submit">
            Guardar Edición
        </button>

    </form>

<%@include file="components/bodyfinal.jsp" %>