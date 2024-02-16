def call(Map stageParams) {
 
    checkout([
       # $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        urls: [[ url: stageParams.url ]]
    ])
  }
