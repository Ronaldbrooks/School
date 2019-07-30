var cap = 10;

function addCell()
{
    var table = document.getElementById("cell");
    var count = table.rows.length;

    if(count == cap)
    {
        alert("Too many cells!");
    }
    else
    {
        var row = table.insertRow(count);
        var newCell = row.insertCell(0);
        var cellInput = document.createElement('input');
        cellInput.type = "text";
        newCell.appendChild(cellInput);
    }
}

function removeCell()
{
    var table = document.getElementById("cell");
    var count = table.rows.length;

    if( count > 1)
    {
        table.deleteRow(-1);
    }
}

function sortCell()
{

}
