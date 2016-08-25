var app = angular.module('app', []);

function verdictCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#verdict").addClass("active");

    $scope.newsTypes = [
      {name:'全部', value:'0'},
      {name:'约', value:'1'},
      {name:'编', value:'2'},
      {name:'爬', value:'3'}
    ];
    $scope.newsType = $scope.newsTypes[0]; //default value

    $scope.cities = [
      {name:'全部', value:'0'},
      {name:'中国', value:'1'},
      {name:'纽约', value:'2'},
      {name:'伦敦', value:'3'},
      {name:'巴黎', value:'4'},
      {name:'米兰', value:'5'}
    ];
    $scope.city = $scope.cities[0]; //default value

    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }

    $scope.selectType=refresh;
    $scope.selectCity=refresh;

    $scope.goSelect=function() {
        $scope.beginDate = $('#beginDate').val();
        $scope.endDate = $('#endDate').val();

        $scope.page = 0;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/recsysbi/verdict";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
        }
        if($scope.newsType) {
            url += "&type=" + $scope.newsType.value;
        }
        if($scope.city) {
            url += "&cityId=" + $scope.city.value;
        }
        if($scope.beginDate) {
            url += "&beginDateParam=" + $scope.beginDate;
        }
        if($scope.endDate) {
            url += "&endDateParam=" + $scope.endDate;
        }
        if($scope.content) {
            if($scope.content=="汇总") {
                $scope.content = "-1";
            }
            url += "&content=" + $scope.content;
        }
        console.log(url);
        $http.get(url).success(function(data) {
            $scope.listContent = data.result;

            $scope.page = data.page;
            $scope.pageSize = data.pageSize;
            $scope.count = data.count;
        });
	}
}

function auditCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#audit").addClass("active");

    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }

    $scope.selectType=refresh;
    $scope.selectCity=refresh;
    $scope.goSelect=function() {
        $scope.beginDate = $('#beginDate').val();
        $scope.endDate = $('#endDate').val();
        $scope.page = 0;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/recsysbi/audit";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
        }
        if($scope.newsType) {
            url += "&type=" + $scope.newsType.value;
        }
        if($scope.city) {
            url += "&cityId=" + $scope.city.value;
        }
        if($scope.beginDate) {
            url += "&beginDateParam=" + $scope.beginDate;
        }
        if($scope.endDate) {
            url += "&endDateParam=" + $scope.endDate;
        }
        if($scope.content) {
            url += "&content=" + $scope.content;
        }
        console.log(url);
        $http.get(url).success(function(data) {
            $scope.listContent = data.result;
            $scope.page = data.page;
            $scope.pageSize = data.pageSize;
            $scope.count = data.count;
        });
	}
}

function editorCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#editor").addClass("active");

    $scope.newsTypes = [
      {name:'全部', value:'0'},
      {name:'约', value:'1'},
      {name:'编', value:'2'}
    ];
    $scope.newsType = $scope.newsTypes[0]; //default value

    $scope.belongtos = [
      {name:'全部', value:'0'},
      {name:'站内', value:'1'},
      {name:'站外', value:'2'}
    ];
    $scope.belongto = $scope.belongtos[0]; //default value

    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }

    $scope.selectType=refresh;
    $scope.selectBelongto=refresh;

    $scope.goSelect=function() {
        $scope.beginDate = $('#beginDate').val();
        $scope.endDate = $('#endDate').val();
        $scope.page = 0;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/recsysbi/editor";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
        }
        if($scope.newsType) {
            url += "&type=" + $scope.newsType.value;
        }
        if($scope.belongto) {
            url += "&belongto=" + $scope.belongto.value;
        }
        if($scope.beginDate) {
            url += "&beginDateParam=" + $scope.beginDate;
        }
        if($scope.endDate) {
            url += "&endDateParam=" + $scope.endDate;
        }
        if($scope.content) {
            url += "&content=" + $scope.content;
        }
        console.log(url);
        $http.get(url).success(function(data) {
            $scope.listContent = data.result;
            $scope.page = data.page;
            $scope.pageSize = data.pageSize;
            $scope.count = data.count;
        });
	}
}

function mediaCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#media").addClass("active");

    $scope.cities = [
      {name:'全部', value:'0'},
      {name:'中国', value:'1'},
      {name:'纽约', value:'2'},
      {name:'伦敦', value:'3'},
      {name:'巴黎', value:'4'},
      {name:'米兰', value:'5'}
    ];
    $scope.city = $scope.cities[0]; //default value

    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }

    $scope.selectType=refresh;
    $scope.selectCity=refresh;

    $scope.goSelect=function() {
        $scope.beginDate = $('#beginDate').val();
        $scope.endDate = $('#endDate').val();

        $scope.page = 0;
        $scope.orderbyDataValue = 0;
        refresh();
    }

    $scope.orderbyData=function(orderbyDataValue) {
        $scope.orderbyDataValue = orderbyDataValue;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/recsysbi/media";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
        }
        if($scope.newsType) {
            url += "&type=" + $scope.newsType.value;
        }
        if($scope.city) {
            url += "&cityId=" + $scope.city.value;
        }
        if($scope.beginDate) {
            url += "&beginDateParam=" + $scope.beginDate;
        }
        if($scope.endDate) {
            url += "&endDateParam=" + $scope.endDate;
        }
        if($scope.content) {
            url += "&content=" + $scope.content;
        }
        if($scope.orderbyDataValue) {
            url += "&orderbyDataValue=" + $scope.orderbyDataValue;
        }
        console.log(url);

        $http.get(url).success(function(data) {
            $scope.listContent = data.result;

            $scope.page = data.page;
            $scope.pageSize = data.pageSize;
            $scope.count = data.count;
        });
	}
}