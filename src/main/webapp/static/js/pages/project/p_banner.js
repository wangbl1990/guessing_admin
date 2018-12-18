$(function () {
    var _table = $('#table');
    _table.bootstrapTable();
})


var addBtn = $("#addBtn");
addBtn.click(function () {
    $("#myModal").modal("show");
});