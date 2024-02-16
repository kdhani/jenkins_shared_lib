def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name1:  stageParams.branch ]],
        urls: [[ url: stageParams.url ]]
    ])
  }
