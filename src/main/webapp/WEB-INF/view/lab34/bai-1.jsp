<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body class="container">
<h1 class="text-center">Môn học</h1>
<form action="/lab34/add" method="post">
    <div class="mb-3 row">
        <label class="col-sm-2 col-form-label">Mã môn</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="maMon">
        </div>
    </div>
    <div class="mb-3 row">
        <label  class="col-sm-2 col-form-label">Tên môn</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="tenMon">
        </div>
    </div>
    <div class="mb-3 row">
        <label  class="col-sm-2 col-form-label">Số tín chỉ</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="soTinChi">
        </div>
    </div>
    <div class="mb-3 row">
        <label  class="col-sm-2 col-form-label">Chuyên ngành</label>
        <div class="col-sm-10">
            <select class="form-select" aria-label="Default select example" name="chuyenNganh">
                <option value="UDPM">UDPM</option>
                <option value="CNTT">CNTT</option>
                <option value="PTPM">PTPM</option>
            </select>
        </div>
    </div>
    <div class="mb-3 row">
        <label  class="col-sm-2 col-form-label">Giảng viên</label>
        <div class="col-sm-10 d-flex">
            <div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="MinhDQ8" name="MinhDQ8">
                    <label class="form-check-label" >
                        MinhDQ8
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="DungNA29" name="DungNA29">
                    <label class="form-check-label" >
                        DungNA29
                    </label>
                </div>
            </div>
            <div class="ms-5">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="TienNH21" name="TienNH21">
                    <label class="form-check-label" >
                        TienNH21
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="NguyenVV4" name="NguyenVV4">
                    <label class="form-check-label">
                        NguyenVV4
                    </label>
                </div>
            </div>

        </div>

    </div>
    <div class="mb-3 row">
        <label  class="col-sm-2 col-form-label">Bắt buộc</label>
        <div class="col-sm-10">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="batBuoc" value="true" checked>
                <label class="form-check-label" >
                    Có
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="batBuoc" value="false">
                <label class="form-check-label" >
                    Không
                </label>
            </div>
        </div>
    </div>

    <div>
        <button type="submit" class="btn btn-success">ADD</button>
    </div>
</form>

<table class="table table-striped table-hover">
    <tr>
        <th>Mã môn</th>
        <th>Tên môn</th>
        <th>Số tín chỉ</th>
        <th>Chuyên ngành</th>
        <th>Giảng viên</th>
        <th>Bắt buộc</th>
        <th>Chức năng</th>
    </tr>
    <c:forEach items="${listMonHoc}" var="monHoc">
        <tr>
            <td>${monHoc.maMon}</td>
            <td>${monHoc.tenMon}</td>
            <td>${monHoc.soTinChi}</td>
            <td>${monHoc.chuyenNganh}</td>
            <td>${monHoc.getTeachers()}</td>
            <td>${monHoc.batBuoc=='true' ? 'Có' : 'Không'}</td>
            <td>
                <a href="">
                    <button type="button" class="btn btn-danger">DELETE</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>