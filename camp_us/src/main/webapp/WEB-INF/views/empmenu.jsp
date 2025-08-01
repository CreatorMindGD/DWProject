<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="wrapper">
  <!-- Preloader -->
  <div class="preloader flex-column justify-content-center align-items-center">
    <img class="animation__shake" src="<%=request.getContextPath() %>/resources/bootstrap/dist/img/Camp_usLogo.png" alt="Camp_usLogo" height="120" width="240">
  </div>

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light" style="height:70px;">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Navbar Search -->
  
       
      <!-- Messages Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <span class="custom-icon-message"></span>
          <span class="badge badge-danger navbar-badge">3D</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Brad Diesel
                  <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">Call me whenever you can...</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  John Pierce
                  <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">I got your message bro</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Nora Silvester
                  <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">The subject goes here</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
        </div>
      </li>
      <!-- Notifications Dropdown Menu -->
      <div class="ml-2"></div>
      <button type="button" class="btn btn-block btn-info btn-flat mt-1" style="background-color:#79aaa4;border: none; width:100px;height:40px; border-radius:5px;">로그아웃</button>
      <li>
      <div class="row ml-4 mr-4">
      mimi
      </div>
      <div class="row ml-4 mr-4">mimi</div>
      </li>
      <li>
      <div class="image" style="cursor:pointer;" onclick="OpenWindow('mypage','글등록',800,700);">
          <img src="<%=request.getContextPath() %>/member/getPicture?id=mimi" class="img-circle img-md" alt="User Image" style="width:45px; height:45px; object-fit:cover;">
        </div>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-white-primary elevation-1" style="border:1px solid #dedede">
    <!-- Brand Logo -->
   <a href="" class="brand-link">
  <img src="<%=request.getContextPath() %>/resources/bootstrap/dist/img/Camp_usLogo.png"
       alt="camp_us Logo"
       class="brand-image custom-logo" />
</a>


      <!-- SidebarSearch Form -->


      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
    <li class="nav-item" data-url="">
<a href="" class="nav-link">
  <span class="nav-icon custom-img-icon"></span>
  &nbsp;&nbsp;&nbsp;
  <p class="fas">HOME</p>
</a>
</li>
          <li class="nav-item" data-url="">
            <a href="#" class="nav-link">
              <i class="nav-icon fas psad-img-icon"></i>
              <p class="fas">&nbsp;
                게시판 관리
              </p>
            </a>
          </li>
            <li class="nav-item" data-url="">
            <a href="#" class="nav-link">
              <i class="nav-icon fas cal-img-icon"></i>
              <p class="fas">&nbsp;
                캘린더
              </p>
            </a>
          </li>
          <li class="nav-item">            
            <a href="#" class="nav-link">
              <i class="nav-icon fas mes-img-icon"></i>
              <p class="fas">&nbsp;
                커뮤니티
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item" data-url="">
                <a href="#" class="nav-link">
                  <i class="far nav-icon"></i>
                  <p>&nbsp;&nbsp;&nbsp;공지사항</p>
                </a>
              </li>
              <li class="nav-item" data-url="">
                <a href="#" class="nav-link">
                  <i class="far nav-icon"></i>
                  <p>&nbsp;&nbsp;&nbsp;질의응답</p>
                </a>
              </li>
            </ul>
          </li>          
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
  <div class="content-wrapper">
 <iframe id="mainFrame" name="ifr" frameborder="0" style="width:100%;height:100vh;"></iframe> 	 
    </div>
    <!-- /.content -->
  </div>
  
 
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<script>
  function Iframe(url) {
    document.getElementById('mainFrame').src = url;
  }
  document.querySelectorAll('.nav-item').forEach(menu => {
	  menu.addEventListener('click', function (e) {
	    e.preventDefault(); // <a> 링크 기본 동작 무조건 방지
	    const url = this.getAttribute('data-url');
	    if (url) parent.mainFrame.location.href = url;
	  });
	});
</script>
<!-- ./wrapper -->
<!-- jQuery -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- ChartJS -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/chart.js/Chart.min.js"></script>
<!-- Sparkline -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/sparklines/sparkline.js"></script>
<!-- JQVMap -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jqvmap/jquery.vmap.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
<!-- jQuery Knob Chart -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery-knob/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/moment/moment.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/daterangepicker/daterangepicker.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<!-- Summernote -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/summernote/summernote-bs4.min.js"></script>
<!-- overlayScrollbars -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/adminlte.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/demo.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/pages/dashboard.js"></script>
</body>
</html>
