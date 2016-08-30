var app = angular.module('app', []);

function realtimeCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#realtime").addClass("active");
    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }
    $scope.goSelect=function() {
        $scope.page = 0;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/monitor/realtime";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
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

function dailyrebackCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#dailyreback").addClass("active");
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
        $scope.page = 0;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/monitor/dailyreback";
        console.log(url);

        $http.get(url).success(function(data) {
            $scope.listContent = data.result;
            $scope.page = data.page;
            $scope.pageSize = data.pageSize;
            $scope.count = data.count;
        });
	}
}

function redSoldierCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#redSoldier").addClass("active");

    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }


    $scope.goSelect=function() {
        $scope.page = 0;
        refresh();
    }

    function refresh() {
        var url = contextPath + "/monitor/redSoldier";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
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

function optionalCtrl($scope, $http) {
    $("#nav-accordion").removeClass("active");
    $("#optional").addClass("active");

    refresh();//init

    $scope.getPage = function(goPage) {
        if(goPage>=0 && goPage<$scope.pageSize) {
            $scope.page=goPage;
            refresh();
        }
    }

    $scope.selectType=refresh;
    $scope.selectCity=refresh;

    function refresh() {
        var url = contextPath + "/monitor/optional";
        if($scope.page) {
            url += "?page=" + $scope.page;
        } else {
            url += "?page=0";
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