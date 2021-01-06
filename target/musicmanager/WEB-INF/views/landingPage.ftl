<!--
   freemarker macros have to be imported into a namespace.
   We strongly recommend sticking to 'spring'
   -->
   
<#import "/spring.ftl" as spring/>

<html>
<head>
<title>Student List</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
	.btn {
	  background-color: DodgerBlue;
	  border: none;
	  color: white;
	  padding: 12px 16px;
	  font-size: 16px;
	  cursor: pointer;
	}

/* Darker background on mouse-over */
.btn:hover {
  background-color: RoyalBlue;
}
</style>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-1">
				<img src="<@spring.url'/img/musiclogo.png'/>" class="rounded-circle", height="100"
					alt="Cinque Terre">
			</div>
			<div class="col-3">
			<br>
				<h3>Music Manager</h3>
			</div>
		</div>
		<br>
		<div>
			<nav class="navbar navbar-expand-sm bg-warning navbar-dark">
				<ul class="navbar-nav">
					<li class="nav-item active"><a class="nav-link" href="#">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Genre</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Musician</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Singer</a></li>
					<li class="nav-item"><a class="nav-link" href="#">My Playlist</a></li>
					</li>
				</ul>
			</nav>
		</div>
		<br>
		<div>
			<table border="1" id="studentTable" class="table table-striped">
				<tr>
					<th>Song name</th>
					<th>Release Time</th>
					<th>Genre</th>
					<th>Musician</th>
					<th>Singer</th>
					<th width="20px"></th>
					<th width="20px"></th>
					<th width="20px"></th>
				</tr>
				<#list songs as song>
					<tr>
					<th>${song.songName}</th>
					<th>${song.releaseTime}</th>
					<th>${song.genre.name}</th>
					<th>${song.musician.name}</th>
					<th>${song.singer.name}</th>
					<th><button class="btn btn-purple"><i class="fa fa-edit"></i></button></th>
					<th><button class="btn"><i class="fa fa-trash"></i></button></th>
					<th><button class="btn btn-purple"><i class="fa fa-heart"></i></button></th>
				</tr>
				</#list>
			</table>
		</div>
	</div>
</body>
</html>