<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>УОТЗ</title>
<link href="css/style.css" rel="stylesheet" type="text/css">

</head>

<body onload=${popupMessage} bgcolor="#4a5770"; onkeyup="hotkey(event)">

<table width="690" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="main_border" >
<tr>
    <td><img src="img/header.gif" width="690" height="100"></td>
  </tr>

  <tr>
    <td><table width="690" border="0" cellspacing="0" cellpadding="0">
      <tr>

        <td width="182px" valign="top" class="left">
		
<p align="center" class="title">Навігація</p>
<div id="coolmenu">
<a href="/statistic/start">Головна</a>
<a href="/statistic/crime">Злочин</a>
<a href="/statistic/scouting">Радіорозвідки</a>
<a href="/statistic/reference">Довідки</a>
<a href="/statistic/award">Ухвали</a>
<a href="/statistic/traffic">Трафіки</a>
<a href="/statistic/report">Звіти</a>
</div>	
       </td>
<!--Підгрузка лівого блока!-->


        <td valign="top" class="pol" bgcolor="#ecf2fe"> 

<!--Підгрузка Головного блока-->


<h2>Радіорозвідки</h2>
<form action="scouting" method="post" class="rf"><br>
	<table border="0" cellpadding="2" cellspacing="0" style="width: 480px">
		<tbody>
			<tr>
			<td style="width: 10%;">Злочин:</td>
			<td width="10">
				<input type="hidden" name="scoutingId" value=${scouting.id}>
				<select id="id_crime" name="id_crime" onchange="changeTest()" size="1" class="rfield">
					${crime}
				</select>
			</td>
				
			<td><input type="button" onclick="location.href='/statistic/crime';" value="Додати" /></td>
			</tr>
			<tr>
				<td>Відділ:</td>
				<td colspan="3"><select id="id_department" name="id_department" size="1" class="rfield">${department}</select></td>
			</tr>
			<tr>
				<td>№ рапорту:</td>
				<td ><input name="number_raport" type="text" size="14" class="rfield" value=${scouting.numberRaport}></td>
				<td style="width: 10%;">Дата рапорту:</td>
				<td><input id="date_raport" name="date_raport" type="text" value=${scouting.dateRaportFormat} size="6" class="rfield" onfocus="this.select();_Calendar.lcs(this)"
    onclick="event.cancelBubble=true;this.select();_Calendar.lcs(this)"></td>
			</tr>
			<tr>
				<td>№ довідки:</td>
				<td><input name="number_dovidka" type="text" size="14" value=${scouting.numberReference}></td>
				<td>Дата довідки:</td>
				<td><input id="date_dovidka" name="date_dovidka" type="text" value=${scouting.dateReferenceFormat} size="6" onfocus="this.select();_Calendar.lcs(this)"
    onclick="event.cancelBubble=true;this.select();_Calendar.lcs(this)"></td>
			</tr>
			<tr>
				<td>Виконавець:</td>
				<td colspan="2"><select name="id_employe" size="1" class="rfield">${employe}</select></td>
			</tr>

	<!--Блок динамічної таблиці!-->
	
			<tr>
			<th colspan="4" align="left">
				<script src="addTable.js" type="text/javascript"></script>
				<table id="placeData"  class="tftable" border="1">
    				<th style="width: 40%;">Місце</th><th><img src="img/operators.gif" width="130" height="30"></th><th style="width: 10%;">LAC</th><th style="width: 22%;">CID</th><th></th>
					
					${placeRow}
    				
    				<tr><input type="button" id="add" value="+" onclick="Javascript:addRowPlace()"></tr>
				</table>
			</th>
			</tr>
<!--кінець блока динамічної таблиці!-->

			<tr>
				<td>Примітка:</td>
				<td colspan="4"><textarea name="note" rows="2" cols="45">${scouting.note}</textarea></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="6">
					<button class="button" formmethod="GET" onClick="window.location='/statistic/scouting';">Новий</button>
					<input name="save" id="demo" class="btn_submit disabled" type="submit" value="Зберегти">
					<input name="printReference" class="btn_submit disabled" type="submit" value="Довідка">
				</td>
			</tr>
		</tbody>
	</table>
</form>


<!--Підгрузка Головного блока-->
        
        </td>
      </tr>
    </table></td>
  </tr>
  			
  			
<!--Підгрузка нижнього блока!-->
  <tr>
    <td><img src="img/footer.gif" width="690" height="20"></td>
  </tr>
<!--Підгрузка нижнього блока!-->


</table>


</body>
</html>