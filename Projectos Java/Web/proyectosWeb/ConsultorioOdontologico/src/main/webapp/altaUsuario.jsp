

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/iniciohtml.jsp" %>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

    <h1>Alta de Usuarios</h1>
    <p>Apartado para creación de usuarios.</p>

    <form class="user" action="SvUsuarios" method="post">
        <div class="form-group row">
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                    placeholder="Nombre Usuario">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                    placeholder="Contraseña">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="rol" name="rol" 
                    placeholder="Rol">
            </div>

        </div>

        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Usuario
        </button>

    </form>

<%@include file="components/bodyfinal.jsp" %>