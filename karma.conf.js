module.exports = function (config) {
    config.set({
        basePath: './',
        frameworks: ['jasmine'],
        browsers: [
            'PhantomJS'
        ],
        files: [
            'src/test/js/**/*.spec.js'
        ]
    });
};